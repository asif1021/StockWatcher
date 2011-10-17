/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.gwt.sample.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 *
 * @author asif
 */
public interface StockPriceServiceAsync {
    
    void getPrices(String[] symbols, AsyncCallback<StockPrice[]> callback);
}
