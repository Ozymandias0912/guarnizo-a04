/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Juan Guarnizo
 */
package baseline;

import java.io.File;
import java.io.IOException;

public class Solution43 {

    public static void main(String[] args) throws IOException {

        fileManager web = new fileManager();

        web.fileManager();

        web.ask();

        File indexHtml = web.createFolders();



    }


}
