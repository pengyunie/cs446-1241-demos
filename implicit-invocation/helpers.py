import socket

def communicate(host, port, request):
    s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    s.connect((host, port))
    s.send(str.encode(request))
    response = s.recv(1024).decode()
    s.close()
    return response
