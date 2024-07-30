package FactoryMethodPatternExample;

// Document.java
interface Document {
    void open();
}

// WordDocument.java
class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word document...");
    }
}

// PdfDocument.java
class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document...");
    }
}

// ExcelDocument.java
class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel document...");
    }
}

// DocumentFactory.java
abstract class DocumentFactory {
    public abstract Document createDocument();
}

// WordDocumentFactory.java
class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

// PdfDocumentFactory.java
class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

// ExcelDocumentFactory.java
class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open(); // Outputs: Opening Word document...

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open(); // Outputs: Opening PDF document...

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open(); // Outputs: Opening Excel document...
    }
}

// Output:
// Opening Word document...
// Opening PDF document...
// Opening Excel document...

