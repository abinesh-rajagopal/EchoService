package com.cicd.com.app.EchoResponse;

/**
 * Created by abine on 8/13/2017.
 */
public class EchoResponse {

    private String content;
    private long count;

    public EchoResponse(String content, long count){
        this.content= content;
        this.count=count;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
