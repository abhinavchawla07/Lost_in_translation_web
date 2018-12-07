from flask import Flask, request, redirect, render_template
from flask_cors import CORS
from werkzeug.utils import secure_filename
# from flask_cors import CORS
import os

ocr = Flask(__name__)
ocr.config['UPLOAD_FOLDER'] = "/home/inferno/minor/files"
CORS(ocr)


@ocr.route('/', methods=['GET'])
def hello_world():
    # print("im here")
    return render_template('index.html')

@ocr.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        user = request.form['nm']
        if user == 'abhinav':
            return redirect("user")
        else:
            return "unknown user"


@ocr.route('/user')
def convert():

    # os.system("sh /home/inferno/minor/main.sh "+file)
    return "welcome back, Abhinav!"


@ocr.route('/upload', methods=['POST', 'GET'])
def upload_file():
    file = request.files['image']
    f = os.path.join(ocr.config['UPLOAD_FOLDER'], file.filename)
    file.save(f)
    os.system("sh /home/inferno/minor/main.sh " + ocr.config['UPLOAD_FOLDER'] + "/" + file.filename)
    file = open("t1.txt", 'r');
    result = file.read()
    return render_template('Result.html', result=result)


#
# @ocr.route('/upload', methods=['GET', 'POST'])
# def uploader():
#     if request.method == 'POST':
#         f = request.files['file']
#         fname=secure_filename(f.filename)
#         f.save(os.path.join(ocr.config['UPLOAD_FOLDER'], fname))
#         # print(ocr.config['UPLOAD_FOLDER']+"/"+fname)
#         os.system("sh /home/inferno/minor/main.sh " + ocr.config['UPLOAD_FOLDER']+"/"+fname)
#         file = open("t.txt", 'r');
#         return file.read()
#         # return "upload successful"
#     else:
#         return "failed"


if __name__ == '__main__':
    ocr.run(host='0.0.0.0', port=5000, debug=True)
