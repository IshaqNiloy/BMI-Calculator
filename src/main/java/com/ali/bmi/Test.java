/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ali.bmi;

/**
 *
 * @author hp
 */
public class Test {
    double z;
    public void setter(double x,double y){
        z = x / (y * y);
    }
    public double getter(){
        return z;
    }
}
