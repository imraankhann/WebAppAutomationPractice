package testBase;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;

import bsh.ParseException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ApacheCLI {
    private static String CONFIG_FILE = null;


	public static void main(String[] args) throws ParseException {

		new CLI(args).parse();  /** To read CLI arguments */


        System.out.println("My config file is: " + CONFIG_FILE);

        Properties properties = new Properties();
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(CONFIG_FILE);
            properties.load(inputStream);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("URL: " + properties.getProperty("url"));
        System.out.println("BrowserType: "+properties.getProperty("browser"));
    }









	public static class CLI {
	    private String[] args = null;
	    private Options options = new Options();

	    public CLI(String[] args) throws ParseException {
	        this.args = args;
	        //Options options = new Options();
	        options.addOption("help", false, "Help!");
	        options.addOption("version", false, "1.0");
	        options.addOption("configFile", true, "Input config file");

	    }

	    public void parse() throws ParseException {
	        // add t option

	        // create the parser
	        CommandLineParser parser = new DefaultParser();
	        try {
	            // parse the command line arguments
	            CommandLine line = parser.parse(options, args);

	            // has the buildfile argument been passed?
	            if (line.hasOption("configFile")) {
	                //System.out.println(line.getOptionValue("configFile"));
                    CONFIG_FILE = line.getOptionValue("configFile");
	            }

	            if (line.getOptions().length == 0 || line.hasOption("help")) {
	                helpFormatter();
	            }

	        } catch (org.apache.commons.cli.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	    }

	    public void helpFormatter() {
	        String helpWithUsageText =
	            "java -cp com.muks.javaexamples.ApacheCommonsCLI -configFile <config-file>";

	        // automatically generate the help statement
	        HelpFormatter formatter = new HelpFormatter();
	        formatter.printHelp(helpWithUsageText, options);
	    }
	}
}
