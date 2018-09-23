package com.qxf;

import java.io.IOException;
import java.io.OutputStream;

public class MyResponse {

    private OutputStream outputStream;

    public OutputStream getOutputStream() {
        return outputStream;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public MyResponse(OutputStream outputStream){
        this.outputStream = outputStream;
    }


    public void write(String content)throws IOException {
        StringBuffer httpResponse = new StringBuffer();
        httpResponse.append("HTTP/1.1 200 ok\n")
                    .append("Content-Type: text/html\n")
                    .append("\r\n")
                    .append("<html><body>")
                    .append(content)
                    .append("</body></html>");

        outputStream.write(httpResponse.toString().getBytes());
        outputStream.close();

    }
}
