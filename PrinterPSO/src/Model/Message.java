/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


/**
 *
 * @author ariel
 */
public class Message {
    private String sourceID;
    private String content;

    public Message(String sourceID, String content) {
        this.sourceID = sourceID;
        this.content = content;
    }

    public String getSourceID() {
        return sourceID;
    }

    public void setSourceID(String destinationID) {
        this.sourceID = destinationID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }    
}
