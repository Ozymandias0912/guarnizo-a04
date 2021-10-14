package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileManager {

    private Scanner input;
    private String websiteName;
    private String author;
    private String cssAnswer;
    private String jsAnswer;

    public  void fileManager(){//talk to ta about this sonarlint issue
        this.input = new Scanner(System.in);
        this.websiteName = "cs23";
        this.author = "Juan Guarnizo";
        this.cssAnswer = "maybe";
        this.jsAnswer = "maybe";


    }

    public String getWebsiteName(){
        return this.websiteName;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getCssAnswer(){
        return this.cssAnswer;
    }

    public String getJsAnswer(){
        return this.jsAnswer;
    }

    public void ask(){
        System.out.println("Site name: ");
        websiteName = input.nextLine();

        System.out.println("Author: ");
        author = input.nextLine();

        System.out.println("Do you want a folder for JavaScript?");
        jsAnswer = input.nextLine();

        System.out.println("Do you want a folder for CSS?");
        cssAnswer = input.nextLine();

    }

    public void createFolders() throws IOException {
        String pathInput = "data/website/" +websiteName;

        File folders = new File(pathInput);


        if(folders.mkdirs()){
            System.out.printf("Created ./%s%n", pathInput);


        }
        String indexPathInput = pathInput +"/index.html";
        File fol = new File(indexPathInput);
        if(fol.createNewFile()){
            System.out.printf("Created ./%s%n", indexPathInput);
        }



        String template = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <title>" + websiteName +"</title>\n" +
                "    <meta>" + author + "</meta>\n" +
                "</head>\n" +
                "<body>\n" +
                "</body>\n" +
                "</html>";
        try (FileWriter fWriter = new FileWriter(fol)) {
            fWriter.write(template);
        }
        //fix issues before this line
        if(jsAnswer.equals("yes") || jsAnswer.equals("YES") || jsAnswer.equals("y")
                || jsAnswer.equals("Y") || jsAnswer.equals("Yes")){
            String cssPath = pathInput + "/js";
            File css = new File(cssPath);
            if(css.mkdir()){
                System.out.printf("Created ./%s%n", cssPath);
            }
        }


        if(cssAnswer.equals("yes") || cssAnswer.equals("YES") || cssAnswer.equals("y")
        || cssAnswer.equals("Y") || cssAnswer.equals("Yes")){
            String cssPath = pathInput + "/css";
            File css = new File(cssPath);
            if(css.mkdir()){
                System.out.printf("Created ./%s%n", cssPath);
            }
        }



    }//end create folders method


}
