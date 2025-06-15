package Strings;

//laatcode contest 454 Q1

public class videoCaption {

        public String generateTag(String caption) {

            String[] words = caption.trim().split("\\s+");

            StringBuilder tag = new StringBuilder("#");

            for (int i = 0; i < words.length; i++) {
                String word = words[i].replaceAll("[^a-zA-Z]", "");

                if (word.isEmpty()) continue;

                if (i == 0) {
                    tag.append(word.toLowerCase());
                } else {
                    tag.append(Character.toUpperCase(word.charAt(0)));
                    if (word.length() > 1) {
                        tag.append(word.substring(1).toLowerCase());
                    }
                }
            }

            if (tag.length() > 100) {
                return tag.substring(0, 100);
            }

            return tag.toString();
        }


}
