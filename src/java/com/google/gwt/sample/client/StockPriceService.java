/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.gwt.sample.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 *
 * @author asif
 */

@RemoteServiceRelativePath("stockPrices")
public interface StockPriceService extends RemoteService{
    
    StockPrice[] getPrices(String[] symbols);
}
