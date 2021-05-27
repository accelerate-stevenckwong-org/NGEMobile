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
        newFeatures += "NCT-4 - Integrate Payment Gateway <br/>";
        
                
        // ******** End of new features
        
        newFeatures += "<br/><h2>Existing Features</h2>";
        
        // ******** Move the last new features here 
        newFeatures += "NCT-30 - Launch new crypto <br/>";
        newFeatures += "NCT-10 - API for SignUp <br/>";
        newFeatures += "NCT-9 - Web UI for SignUp <br/>";
        newFeatures += "<br/>NCT-12 - Build Data Structure for User Profile<br/>";
        // ******** End of old features
        
        return newFeatures;
    }
    
}
