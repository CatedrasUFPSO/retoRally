package co.edu.ufpso.rally.code;

import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;

public class KeyCode {

    public static void getCode() {
        String uri = "mongodb+srv://rally:ithxUw0IowVjpRFs@cluster0.1iegep7.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("rally");
            MongoCollection<Document> collection = database.getCollection("books");

            Document doc = collection.find(eq("readed", false)).first();

            if (doc != null) {
                System.out.println("""
                                   *** ---
                                   
                                   Aún debes trabajar!!!""");
                System.out.println("\n --- ***");
            } else {
                System.out.println("No se han encontrado datos");
            }
        }
    }
}
