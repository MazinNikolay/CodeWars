public class Task9WhosLikeIt {
    public static void main(String[] args) {
        System.out.println(whoLikesIt());
        System.out.println(whoLikesIt(""));
        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Peter", "Alex"));
        System.out.println(whoLikesIt("Peter", "Alex", "Max"));
        System.out.println(whoLikesIt("Peter", "Alex", "Max", "Ignat"));
        System.out.println(whoLikesIt("Peter", "Alex", "Max", "Ignat", "Donna", "Magdasuka"));System.out.println(whoLikesIt());
        System.out.println();
        System.out.println(whoLikesItAlternate());
        System.out.println(whoLikesItAlternate(""));
        System.out.println(whoLikesItAlternate("Peter"));
        System.out.println(whoLikesItAlternate("Peter", "Alex"));
        System.out.println(whoLikesItAlternate("Peter", "Alex", "Max"));
        System.out.println(whoLikesItAlternate("Peter", "Alex", "Max", "Ignat"));
        System.out.println(whoLikesItAlternate("Peter", "Alex", "Max", "Ignat", "Donna", "Magdasuka"));
    }

    public static String whoLikesIt(String... names) {
        String result;
        String like = names.length < 2 ? "likes" : "like";
        String whoLike = "";
        if (names.length == 0) whoLike = "no one";
        else {
            if (names.length < 4) {
                for (int i = 0; i < names.length; i++) {
                    switch (i) {
                        case 0 -> whoLike = names[i];
                        case 1 -> whoLike = names.length < 3 ? whoLike + " and " + names[i] : whoLike + ", " + names[i];
                        default -> whoLike += " and " + names[i];
                    }
                }
            } else {
                whoLike = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others";
            }
        }
        result = whoLike + " " + like + " this";
        return result;
    }

    public static String whoLikesItAlternate(String... names) {
        switch (names.length) {
            case 0: return "no one likes it";
            case 1: return String.format("%s likes it", names[0]);
            case 2: return String.format("%s and %s like it", names[0], names[1]);
            case 3: return String.format("%s, %s and %s like it", names[0], names[1], names[2]);
            default: return String.format("%s, %s and %d others like it",names[0],names[1],names.length-2);
        }
    }
}
