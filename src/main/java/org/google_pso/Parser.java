package org.google_pso;

import com.beust.jcommander.JCommander;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;


public class Parser {

    public static void main(String[] argv) throws IOException {
        Args args = new Args();
        JCommander jc = new JCommander(args);
        jc.parse(argv);
        Gson gson = new Gson();

        try (FileReader reader = new FileReader(args.jsonFile)) {
            JSONConfig config = gson.fromJson(reader, JSONConfig.class);

            System.out.println("Project: " + config.getProject());
            System.out.println("Region: " + config.getRegion());
            System.out.println("JSONPath: " + config.getPipelineOptions().get("JSONPath"));
            System.out.println("topology: " + config.getLabels().getTopology());
            System.out.println("additional labels: " + config.getLabels().getAdditionallabels());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The value of location is: " + args.output_location);
        System.out.println("The value of type is: "+args.output_type);
    }
}
