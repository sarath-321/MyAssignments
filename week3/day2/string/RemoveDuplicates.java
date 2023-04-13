package week3.day2.string;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] split = text.split(" ");
		String duplicate = "";
		String removeDuplicate = text;

		for (int i = 0; i < split.length - 1; i++) {
			for (int j = i + 1; j < split.length - 1; j++) {

				if (split[i].equals(split[j])) {
					count++;
					duplicate = split[j];
				}
			}
		}

		if (count > 0) {
			String replaceAll = removeDuplicate.replaceAll(duplicate, "");
			System.out.println("The string without duplicate words is:" + " " + replaceAll);
		}
		else {
			System.out.println("There is no duplicates found in a given string :"+text);
		}
	}
}