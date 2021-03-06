from flask import Flask, abort, request, jsonify
import json
import requests
import numpy as np

app = Flask(__name__)


@app.route('/accounts', methods=['POST'])
def accounts():
    if not request.json:
        abort(400)

    balance_json = json.dumps(request.get_json(request.json))
    bjson = json.loads(balance_json)

    json_data=[]
    
    for key in bjson:
        for sub_key in bjson[key]:
            if 'Balance' in sub_key:
                json_data = (str(bjson['Data']['Balance'][0]['Amount']))
            elif 'Transaction' in sub_key:
                for i in bjson['Data']['Transaction']:
                  json_data.append(i['Amount'])
    
    print (type(json_data))

    return (str(json_data))



# @app.route('/requests', methods=['GET', 'POST'])
# def get_request():
#     url = "https://as.aspsp.ob.forgerock.financial/oauth2/.well-known/openid-configuration"
#     headers = {
#     'Cache-Control': "no-cache",
#     'Pragma': "no-cache",
#     'Cookie': "cookiename=werewrw;cook",
#     'Postman-Token': "0fe95cca-a949-428e-88e9-19da3e190ad0"
#     }

#     response = requests.request("GET", url, headers=headers)

#     response_text = str(response.text)
    
#     return (jsonify(response_text))



if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000, debug=True)






