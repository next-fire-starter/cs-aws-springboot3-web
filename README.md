# AWS lambda spring boot

### 初期インストール確認 Docker
```
docker version
```
```
aws --version
```
```
sam --version
```


### 実行方法
```
gradle build
gradle bootRun
```

### AWSへのデプロイ(SAM) XXXにはAWSのAccessKeyとSecret　Access Keyを設定
#### 参考 https://blog.frevo-works.co.jp/entry/2025/01/14/164712
```
aws configure

AWS Access Key ID [None]: XXXXXXXXXXXXXX
AWS Secret Access Key [None]: XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
Default region name [None]: ap-northeast-1
Default output format [None]:

sam build

# 初回は --guidedオプションをつける
sam deploy --guided

# 2回目以降は以下
sam deploy
```

### AWSへのデプロイ(手動)
以下のコマンドで作成されたbuild/distributions/my-service.zipをダウンロードしてAWSに配備
```
gradle buildZip
``` 