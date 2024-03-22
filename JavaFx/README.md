## JavaFx 

## 1. Tạo chương trình JavaFX đầu tiên

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
        Button btn1=new Button("Say, Hello World");  
        btn1.setOnAction(new EventHandler<ActionEvent>() {  
              
            @Override  
            public void handle(ActionEvent arg0) {  
                // TODO Auto-generated method stub  
                System.out.println("hello world");  
            }  
        });  
        StackPane root = new StackPane();  
        root.getChildren().add(btn1);  
        Scene scene = new Scene(root,600,400);      
        primaryStage.setTitle("First JavaFX Application");  
        primaryStage.setScene(scene);  
        primaryStage.show();  
    }

    public static void main (String[] args) {  
        launch();  
    }  
  
}  
```

_Kết quả:_

<img src="https://github.com/CUNGVANTHANG/Java/assets/96326479/bb8170c6-af50-4193-b4ff-56a0e5f3122a" width="500px">

## 2. Thay đổi scene

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
