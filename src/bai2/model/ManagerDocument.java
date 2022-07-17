package bai2.model;

import java.util.ArrayList;
import java.util.List;

public class ManagerDocument {
    List<Document> documents;

    public ManagerDocument() {
        this.documents = new ArrayList<>();
    }

    public void addDocument(Document document) {
        this.documents.add(document);
    }

    public void showDetail() {
        this.documents.forEach(document -> System.out.println(documents.toString()));
    }

    public void searchByBook() {
        this.documents.stream().filter(doc -> doc instanceof  Book).forEach(doc -> System.out.println(doc.toString()));
    }

    public void searchByMegazine() {
        this.documents.stream().filter(doc -> doc instanceof Megazine).forEach(doc -> System.out.println(doc.toString()));
    }

    public void seachByNewsPaper() {
        this.documents.stream().filter(doc -> doc instanceof Newspaper).forEach(doc -> System.out.println(doc.toString()));
    }

    public boolean deleteDocument(String id) {
        Document doc = this.documents.stream()
                .filter(document -> document.getId().equals(id))
                .findFirst().orElse(null);
        if (doc == null) {
            return false;
        }
        this.documents.remove(doc);
        return true;
    }


}
