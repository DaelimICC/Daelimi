## Java and Python 설치
```
 - sudo apt-get install openjdk-17-jdk 로 설치
 - sudo apt-get install python3 로 파이썬 설치
```

## venv 설치 및 생성
```
 - sudo pt-get install python3-venv 로 파이썬 가상환경을 제공하는 모듈 설치
 - python3 -m venv venv 로 가상환경 생성
 - source venv/bin/activate 로 가상환경 활성화
```

## Django 설치 및 실행
```
 - pip install django 명령어를 이용해 장고 설치
 - python3 -m django --version 명령어로 장고 버전 확인
 - django-admin startproject DaelimAPI 를 이용하여 프로젝트 생성
```

## settings.py 파일 수정방법
```
 - vi ./DaelimAPI/settings.py 를 입력하여 vi 에디터로 settings.py 파일을 열어준다.
 - 파일 내용중 ALLOW_HOST 항목을 찾아 "ALLOWED_HOST = ['*']" 로 바꿔준다.
 - 파일 내용중 TIME_ZONE 항목을 찾아 "TIME_ZONE = 'Asia/Seoul'" 로 바꿔준다.
```

## 포트 열기
```
 - python3 manage.py runserver 0.0.0.0:8000 명령어로 8000번 포트를 열어준다.
```
