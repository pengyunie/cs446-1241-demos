#!/bin/bash
# Setup the test repos for this demo at the given location

_DIR=$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )

function main() {
        local parent_dir=${1:-$HOME/test/simpleci}; shift

        if [ -d $parent_dir ]; then
                echo "The target directory $parent_dir already exists, please delete it and try again."
                exit 1
        fi

        mkdir -p $parent_dir

        set -x

        # the "remote" repo
        git init --bare $parent_dir/repo-remote

        # the developer's repo
        git clone $parent_dir/repo-remote $parent_dir/repo-dev
        cp -r ${_DIR}/tests $parent_dir/repo-dev
        ( cd $parent_dir/repo-dev && git add . && git commit -m "Initial commit" && git branch -M main && git push origin main )

        # the CI's repos: observer and runner
        git clone $parent_dir/repo-remote $parent_dir/repo-ci-observer
        git clone $parent_dir/repo-remote $parent_dir/repo-ci-runner

        set +x

        echo
        echo "Done. To start the demo, run the following commands in three different terminals:"
        echo "  python dispatcher.py"
        echo "  python test_runner.py $parent_dir/repo-ci-runner"
        echo "  python repo_observer.py --dispatcher-server=localhost:8888 $parent_dir/repo-ci-observer"
}

main "$@"
