package com.demo;

import org.apache.avro.AvroTypeException;

public class Applica {

   public static void run(int a){
       if(a<0) {
           throw new AvroTypeException("test");
       }
   }
}
