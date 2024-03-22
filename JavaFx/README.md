## JavaFx 

## Mục lục

- [1. Tạo chương trình JavaFx đầu tiên](#1-tạo-chương-trình-javafx-đầu-tiên)
- [2. Thay đổi Scene](#2-thay-đổi-scene)
- [3. Thông báo Alert](#3-thông-báo-alert)
- [4. Thông báo Dialog](#4-thông-báo-dialog)
- [5. Check box](#5-check-box)
- [6. Property](#6-property)

## 1. Tạo chương trình JavaFX đầu tiên
[:arrow_up: Mục lục](#mục-lục)

- **Bước 1:** **import** `javafx.application.Application` xong đó **extends** `Aplication` và **Override** `start()` như sau:

```java
package application;   
import javafx.application.Application;  
import javafx.stage.Stage;

public class Hello_World extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
          
    }  
}  
```

Phương thức `start()` là điểm khởi đầu của việc xây dựng một ứng dụng JavaFX do đó trước tiên chúng ta cần ghi đè phương thức bắt đầu của lớp `javafx.application.Application`. 

Đối tượng của lớp `javafx.stage.Stage` được truyền vào phương thức `start()` do đó nhập lớp này và chuyển đối tượng của nó vào phương thức `start`. 

`JavaFX.application.Application` cần được nhập để ghi đè phương thức bắt đầu.

- **Bước 2:** Tạo Button

Một nút có thể được tạo bằng cách khởi tạo lớp `javafx.scene.control.Button`

```java
package application;   
import javafx.application.Application;  
import javafx.scene.control.Button;  
import javafx.stage.Stage;

public class Hello_World extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        Button btn1 = newButton("Say, Hello World");  
          
    }  
}  
```

- **Bước 3:** Tạo layout và thêm Button vào đó

```java
package application;   
import javafx.application.Application;  
import javafx.scene.control.Button;  
import javafx.stage.Stage;  
import javafx.scene.layout.StackPane;
 
public class Hello_World extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        Button btn1 = new Button("Say, Hello World");  
        StackPane root = new StackPane();  
        root.getChildren().add(btn1);  
    }  
  
}  
```

Trong ứng dụng này, chúng tôi đã triển khai bố cục `StackPane` (layout theo kiểu xếp chồng). Nó có thể được triển khai bằng cách khởi tạo lớp `javafx.scene.layout.StackPane`.

- **Bước 4:** Tạo Scene (Bối cảnh)

```java
package application;   
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.stage.Stage;  
import javafx.scene.layout.StackPane;

public class Hello_World extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        Button btn1 = new Button("Say, Hello World");  
        StackPane root = new StackPane();  
        root.getChildren().add(btn1);  
        Scene scene=new Scene(root);      
    }  
}  
```

- **Bước 5:** Chuẩn bị Stage (Sân khấu)

```java
package application;   
import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.stage.Stage;  
import javafx.scene.layout.StackPane;  
public class Hello_World extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        Button btn1=new Button("Say, Hello World");  
        StackPane root=new StackPane();  
        root.getChildren().add(btn1);  
        Scene scene=new Scene(root);      
        primaryStage.setScene(scene);  
        primaryStage.setTitle("First JavaFX Application");  
        primaryStage.show();  
    }  
  
}  
```

- **Bước 6:** Tạo sự kiện cho Button

Sẽ có nhiều kiểu tạo sự kiện nhưng chủ yếu người ta hay sử dụng anonymous class, thay vì những cách khác. Bởi vì sự tiện dụng của nó khi sử dụng.

Dùng `setOnAction()` trên nút và xác định **anonymous class Event Handler** làm tham số cho phương thức.

```java
package application;   
import javafx.application.Application;  
import javafx.event.ActionEvent;  
import javafx.event.EventHandler;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.stage.Stage;  
import javafx.scene.layout.StackPane;

public class Hello_World extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        Button btn1 = new Button("Say, Hello World");  
        btn1.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent e) {  
                // TODO Auto-generated method stub  
                System.out.println("hello world");  
            }  
        });  
        StackPane root = new StackPane();  
        root.getChildren().add(btn1);  
        Scene scene = new Scene(root,600,400);      
        primaryStage.setScene(scene);  
        primaryStage.setTitle("First JavaFX Application");  
        primaryStage.show();  
    }  
  
}  
```

- **Bước 7:** Tạo phương thức `main`

Dùng `launch()` để chạy chương trình ứng dụng

```java
package application;   
import javafx.application.Application;  
import javafx.event.ActionEvent;  // Xử lý sự kiện khi một hành động (action) được thực hiện, như nhấn nút.
import javafx.event.EventHandler;  // EventHandler được sử dụng để xử lý các sự kiện.
import javafx.scene.Scene;  // Scene đại diện cho nội dung hiển thị của ứng dụng.
import javafx.scene.control.Button;  
import javafx.stage.Stage;  // Stage là cửa sổ chính của ứng dụng JavaFX.
import javafx.scene.layout.StackPane;  Loại layout trong JavaFX cho phép xếp chồng các nút và các thành phần khác.

public class Hello_World extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub  
        Button btn1 = new Button("Say, Hello World");  
        btn1.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {  // Thiết lập một sự kiện cho nút btn1 bằng cách sử dụng một đối tượng EventHandler.
                // TODO Auto-generated method stub  
                System.out.println("hello world");  
            }  
        });  
        StackPane root = new StackPane();  // Tạo một StackPane để chứa nút.
        root.getChildren().add(btn1);  // Thêm nút vào StackPane.
        Scene scene = new Scene(root,600,400);  // Tạo một Scene với StackPane làm nội dung và kích thước 600x400.    
        primaryStage.setTitle("First JavaFX Application");  // Đặt tiêu đề cho Stage chính.
        primaryStage.setScene(scene);  // Đặt Scene đã tạo làm Scene cho Stage.
        primaryStage.show();  // Hiển thị Stage lên màn hình.
    }

    public static void main (String[] args) {  
        launch();  //  Khởi động ứng dụng JavaFX.
    }  
  
}  
```

_Kết quả:_

<img src="https://github.com/CUNGVANTHANG/Java/assets/96326479/bb8170c6-af50-4193-b4ff-56a0e5f3122a" width="500px">

## 2. Thay đổi Scene
[:arrow_up: Mục lục](#mục-lục)

```java
package org.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application{
    Stage window;
    Scene scene1, scene2;

    @Override
    public void start(Stage primaryStage)  {
        window = primaryStage;
        // scene1
        Label label = new Label("Welcome");
        Button button1 = new Button("Go to");
        // Tạo sự kiện bấm vào button sẽ chuyển sang scene2
        button1.setOnAction(event -> {
            window.setScene(scene2);
        });
        VBox layout1 = new VBox();
        layout1.getChildren().addAll(label, button1);
        scene1 = new Scene(layout1, 300, 200);

        // scene2
        Button button2 = new Button("Go back");
        // Tạo sự kiện bấm vào button sẽ chuyển sang scene1
        button2.setOnAction(event -> {
            window.setScene(scene1);
        });
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 200, 300);

        // Set bối cảnh ở scene1
        window.setScene(scene1);
        // Hiển thị ứng dụng
        window.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
```

![image](https://github.com/CUNGVANTHANG/Java/assets/96326479/13639213-a7c1-4786-aec5-ae7137cf1ee6)

khi bấm vào button sẽ chuyển sang scene2

![image](https://github.com/CUNGVANTHANG/Java/assets/96326479/fe5663a4-0d70-4a6c-8e05-a80221222a0d)

khi bấm vào button sẽ chuyển sang scene1

## 3. Thông báo Alert
[:arrow_up: Mục lục](#mục-lục)

```java
package org.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Optional;
import java.util.Scanner;

public class Main extends Application{
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage)  {
        primaryStage.setTitle("Alert Example");
        Button button = new Button("Close");
        button.setOnAction(e -> {
            //  CONFIRMATION: Được sử dụng khi cần xác nhận hoặc từ chối một hành động từ phía người dùng
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation");
            alert.setHeaderText("Alert Infomation");
            alert.setContentText("Choose your option");

            // Định nghĩa một loại nút (button type) có tiêu đề là "Yes/NO/CANCEL" và chứa dữ liệu (data) xác nhận hành động
            ButtonType buttonTypeYes = new ButtonType("Yes", ButtonBar.ButtonData.YES);
            ButtonType buttonTypeNO = new ButtonType("No", ButtonBar.ButtonData.NO);
            ButtonType buttonTypeCancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);

            alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNO, buttonTypeCancel); // Thêm các nút vào alert

            Optional<ButtonType> result = alert.showAndWait(); // Hiển thị cửa sổ cảnh báo và chờ đợi người dùng tương tác với nó.

            if (result.get() == buttonTypeYes) {
                System.out.println("Code for yes");
            } else if (result.get().getButtonData() == ButtonBar.ButtonData.NO) {
                System.out.println("Code for no");
            } else {
                System.out.println("Code for cancel");
            }

            String message = result.get().getText();

            // INFORMATION: Được sử dụng khi cần hiển thị thông tin cho người dùng,
            // chẳng hạn như thông tin về một tác vụ đã hoàn thành thành công
            Alert alert1 = new Alert(Alert.AlertType.INFORMATION);
            alert1.setTitle("Information");
            alert1.setHeaderText("Notification");
            alert1.setContentText(message);
            alert1.show();
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

```

![image](https://github.com/CUNGVANTHANG/Java/assets/96326479/52170bfd-25b4-4bce-ba4a-5a48341ce20c)

Bấm vào close sẽ hiện ra

![image](https://github.com/CUNGVANTHANG/Java/assets/96326479/1b6ee2be-674d-4fee-b28e-f62fe653bfaa)

Bấm yes sau đó sẽ hiện ra

![image](https://github.com/CUNGVANTHANG/Java/assets/96326479/ef736cb1-90cc-4e21-9f72-a9fd3994e924)

## 4. Thông báo Dialog
[:arrow_up: Mục lục](#mục-lục)

