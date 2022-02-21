# Python 코드 규약
##### Section : AI/Data, API

##### 1. 들여쓰기는 4칸으로 통일한다. (탭으로 사용한다.)
##### 2. 외부/내장 라이브러리 호출은 코드 최상단에 위치한다.
```py
# 나쁜 예시
import random as rd

variable = rd.randrange(1,20)
import sys
if variable == 2:
    print(sys.path)
````
##### 3. 라이브러리 호출 후 메서드는 2줄을 개행하여 작성한다.
##### 4. 메서드명은 카멜케이스(camelCase)를 사용한다.
##### 5. 변수명은 카멜케이스를 사용하며, 클래스명은 파스칼 표기법을 사용한다.
```py
class StudyMember:
    def __init__(self):
        self.memberName = None
````
##### 6. 한 줄의 최대 길이는 79자이다.
##### 7. 불필요한 공백은 사용하지 않는다.
```py
# 좋은 예시
test(var[2])
# 나쁜 예시
test( var[ 2 ] )
```
##### 8. 상수명은 모두 영문 대문자로 표기한다.
##### 9. 예외 처리시 except:를 지양하고, 명확한 예외를 처리한다.
##### 10. 모든 메서드는 반환값이 있거나, 없어야하며, 없더라도 return None으로 명시해준다.
##### 11. finally 문의 사용을 지양한다.
##### 12. 문자열 모듈 대신, 문자열 메서드의 사용을 권장한다.
```py
# 좋은 예시
if message.startswith('car'):
# 나쁜 예시
if message[:3] == 'car':
```
##### 13. 이 이외 발생하는 모든 규약 문제는 PEP8을 기준으로 검토한다.
