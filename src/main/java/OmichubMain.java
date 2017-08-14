/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import spark.Request;
import spark.Response;
import spark.Route;
 
import static spark.Spark.*;
/**
 *
 * @author wallace
 */
public class OmichubMain {
    
    public static void main(String[] args) {
        get("/", (request, response) -> "Hello World");
    }
}
