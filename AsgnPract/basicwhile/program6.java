class ConsonantsOnly {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' &&
                ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                System.out.print(ch + " ");
            } 

        }
	System.out.print("\n");
    }
}

