#!/bin/bash
set -v

# example of using pipe (the "|" operator) in bash

# this find command lists all files and directories in the current directory and its subdirectories
find .

# this grep command reads some inputs (e.g., from a.txt) and prints only the lines that contain ".java"
grep "\.java" a.txt

# if we combine the two commands using a pipe, the output of the first command is used as the input of the second command
find . | grep "\.java"

# we can even chain more commands together (the last wc command counts the number of lines)
find . | grep "\.java" | grep "src/main"

find . | grep "\.java" | grep "src/main" | wc -l
