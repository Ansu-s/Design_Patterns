package designPattens;

public class AdapterPattern {


    interface XMLFileReader {
        void readXML(String filename);
    }

    static class TextFileReader {
        public void readText(String filename) {
            System.out.println("Reading text file: " + filename);

        }
    }

    static class TextToXMLFileAdapter implements XMLFileReader {
        private TextFileReader textFileReader;

        public TextToXMLFileAdapter(TextFileReader textFileReader) {
            this.textFileReader = textFileReader;
        }

        @Override
        public void readXML(String filename) {
            String textFileName = filename.replace(".xml", ".txt");
            textFileReader.readText(textFileName);
        }
    }


        public static void main(String[] args) {
            TextFileReader textFileReader = new TextFileReader();
            XMLFileReader xmlFileReader = new TextToXMLFileAdapter(textFileReader);
            xmlFileReader.readXML("data.xml");
        }
    }


