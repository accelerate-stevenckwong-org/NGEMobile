/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stevenckwong.ngecryptotrader.web;

/**
 *
 * @author steven
 */
public class GetNewFeatures {
    
    public String newContent() {
        
        String newFeatures = new String();
        
        newFeatures += "<h2>Here are the newest features of the solution</h2>";
        
        // ******** Add new features here...
        // ******** Use this syntax: newFeatures += "[JIRA_ID] - [Some Text] <br/>";
        newFeatures += "[JIRA_ID] - [Some Text] <br/>";
        
                
        // ******** End of new features
        
        newFeatures += "<br/><h2>Existing Features</h2>";
        
        // ******** Move the last new features here 
        newFeatures += "<br/>An Old Feature 3<br/>";
        // ******** End of old features
        
        return newFeatures;
    }
    
}
