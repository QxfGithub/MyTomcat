package com.qxf;

import java.io.IOException;

public class HelloServlet  extends MyServlet{

    @Override
    public void  doGet(MyRequest myRequest,MyResponse myResponse){
        try{
            myResponse.write("get word...");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void  doPost(MyRequest myRequest,MyResponse myResponse){
        try{
            myResponse.write("post word...");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
