package com.qxf;

import java.io.IOException;

public class FindGirlServlet extends MyServlet{

    @Override
    public void  doGet(MyRequest myRequest,MyResponse myResponse){
        try{
            myResponse.write("get Girl...");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void  doPost(MyRequest myRequest,MyResponse myResponse){
        try{
            myResponse.write("post Girl...");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
