import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Hi! What's your name?: ");
		String name = scanner.next();
		System.out.println("Hi " + name + " Let's study for your exam!");

		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		scanner.nextLine();

		String school = age <= 12 ? "You're in the Primary School" : "You're in the Secondary School";
		System.out.println(school);
		System.out.println("Let's beging!");

		int score = 0;

		// Questions for Primary School
		String[] primaryQuestions = { "What is the largest planet in our solar system?",
				"How many continents are there on Earth?", "Which animal is known as the \"king of the jungle\"?",
				"What is the process called when a caterpillar transforms into a butterfly?",
				"What is the capital city of France?" };

		String[] primaryAnswers = { "Jupiter", "Seven", "Lion", "Metamorphosis", "Paris" };

		// Questions for Secondary School
		String[] secondaryQuestions = {
				"In which year was the first successful Apollo mission that put a man on the Moon?",
				"Who wrote the famous novel \"1984\"?", "Which scientist formulated the theory of relativity?",
				"What is the chemical element with atomic number 6?",
				"What famous painting is originally titled \"La Gioconda\"?" };

		String[] secondaryAnswers = { "1969", "George Orwell", "Albert Einstein", "Carbon", "Mona Lisa" };

		// Code

		if (age <= 12) {
			int questionNumber = 1;

			for (String question : primaryQuestions) {
				boolean answerCorrect = false;

				while (!answerCorrect) {
					System.out.println("Question " + questionNumber + ": " + question);
					String primaryUserAnswer = scanner.nextLine();

					if (primaryUserAnswer.equalsIgnoreCase(primaryAnswers[questionNumber - 1])) {
						System.out.println("Correct!");
						score += 10;
						answerCorrect = true;
					} else {
						System.out.println("Incorrect!Try again");
						score -= 5;
					}
				}
				questionNumber++;

			}
			System.out.println("Your score is: " + score + " points of 50");

		} else {
			int questionNumber = 1;

			for (String question : secondaryQuestions) {
				boolean answerCorrect = false;

				while (!answerCorrect) {
					System.out.println("Question " + questionNumber + ": " + question);
					String secondaryUserAnswer = scanner.nextLine();

					if (secondaryUserAnswer.equalsIgnoreCase(secondaryAnswers[questionNumber - 1])) {
						System.out.println("Correct!");
						score += 10;
						answerCorrect = true;
					} else {
						System.out.println("Incorrect!Try again");
						score -= 5;
					}
				}
				questionNumber++;

			}
			System.out.println("Your final score is: " + score + " points of 50");
		}
		if(score<25) {
			System.out.println("Keep studying!");
		}else {System.out.println("You're doing great!");}
	}
}
