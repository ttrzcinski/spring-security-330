package org.ttrzcinski;

public class ToJson {

        // Prosta metoda konwertująca zawartość na format JSON
        public static String asJSON(String content) {
            return "{\"content\": \"" + content + "\"}";
        }
    }

}
