package org.google_pso;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.IStringConverter;
import java.io.File;


public class Args {
    public class FileConverter implements IStringConverter<File> {
        @Override
        public File convert(String value) {
            return new File(value);
        }
    }
    @Parameter(names={"--output_location", "-l"})
    String output_location;
    @Parameter(names={"--output_type", "-p"})
    String output_type;

    @Parameter(names = "--jsonFile", converter = FileConverter.class)
    File jsonFile;
}
