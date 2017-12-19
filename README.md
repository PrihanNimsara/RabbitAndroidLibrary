# Rabbit



This Rabbit Android library will be helpful when you want to blur the  image you used in activity background.This library has provided the facility to either to increase or reduce the brightness.If you are to do this in the typical way,the complexity of the code that you have to use is very high.But this would help you to do all this  in just one line.



![alt tag](https://user-images.githubusercontent.com/29063580/27351860-5ab3ea7e-561c-11e7-84e3-1df469b1ca17.jpg)


## Gradle

```java
repositories{
   jcenter()
 }
```

```java
 dependencies {
   ...
  compile 'com.prihanofficial:rabbit:1.0.0'
 }
```

#### if you using maven use following Maven

```java
<dependency>
  <groupId>com.prihanofficial</groupId>
  <artifactId>rabbit</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```
After setup installing lib to your project you just need only to call it using just few lines of code.

## Usage

#### To use Kokis Android Libarary

Add this code segment inside  your Application class or Activity class

```java
        imageView = (ImageView)findViewById(R.id.iv_imageView);
        System.out.println(SystemClock.currentThreadTimeMillis());
        Bitmap bitmap1 = BitmapFactory.decodeResource(this.getResources(), R.drawable.images);
        System.out.println(SystemClock.currentThreadTimeMillis());

        Rabbit.setContext(this)
                .setBitMap(bitmap1)
                .setScale(1.1f)
                .setRaius(24.0f)
                .setConstarst(0.0f)
                .setBrightnes(1.0f)
                .build();

        Rabbit.getModifiedRabbitBitmap();
        imageView.setImageBitmap(Rabbit.getModifiedRabbitBitmap());
```
## Limitations

- Currently min SDK is set to 17

## Limitations

- Currently min SDK is set to 17

## Changelog

- 1.0.0
    - Initial release

## Author

Prihan Nimsara, [prihanofficial.com](http://prihanofficial.com)

Checkout my other contributions, https://github.com/PrihanNimsara?tab=repositories

## License

Copyright 2017 Prihan Nimsara

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
