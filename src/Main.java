import static java.lang.IO.println;

void main() {
    String[] arr = new String[5];

    List<String> list = new ArrayList<>();

    List<Integer> nums = List.of(1, 2, 3, 4, 5);

    println(nums);
    println(arr);

    println(nums);
    println(Arrays.toString(arr));

    List<String> names = new ArrayList<>();

    ArrayList<String> names2 = new ArrayList<>();

    List<String> colors = List.of("red", "green", "blue");
    println(colors.size());

    List<String> fruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add(1, "Orange");

    String first = fruits.get(0);
    int count = fruits.size();

    fruits.set(0, "Mango");
    fruits.remove("Orange");

    boolean hasMango = fruits.contains("Mango");
    int index = fruits.indexOf("Banana");

    List<String> names3 = List.of("Alice", "Bob", "Carol");

    for (int i = 0; i < names3.size(); i++) {
        System.out.println(i + ": " + names3.get(i));
    }

    for (String name : names3) {
        System.out.println(name);
    }

    List<String> mutableList = new ArrayList<>(List.of("A", "", "B", ""));

    Iterator<String> iter = mutableList.iterator();
    while (iter.hasNext()) {
        String item = iter.next();
        if (item.isEmpty()) {
            iter.remove();
        }

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();


        arrayList.add("Hello");
        linkedList.add("Hello");

        List<String> breakStuff = new ArrayList<>();
        String dumb = "a";
        for(int i = 0; i < 1e9; i++){
            dumb += dumb;
            breakStuff.add(dumb + dumb);
        }

    }

}
