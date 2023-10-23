package com.sunbeam;
import java.util.List;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println(
					"1.Add candidate\n2.Delete candidate\n3.update candidate\n4.get all candidate\n5.Increment candidate\n6.get candidate of given party\n");
			System.out.println("Enter choice :");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				try (CandidateDao dao = new CandidateDao()) {
					// System.out.println("Enter new candidate :");
					// int id=sc.nextInt();
					System.out.println("Enter name :");
					String name = sc.next();
					System.out.println("Enter party name :");
					String party = sc.next();
					System.out.println("Enter votes :");
					int votes = sc.nextInt();
					int cnt = dao.save(name, party, votes);
					System.out.println("Candidates added:" + cnt);

				} // dao close
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try (CandidateDao dao = new CandidateDao()) {
					System.out.print("Enter candidate id to be deleted: ");
					int id = sc.nextInt();
					int cnt = dao.deleteById(id);
					System.out.println("Candidates deleted: " + cnt);
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 3:
				try (CandidateDao dao = new CandidateDao()) {
					System.out.print("Enter candidate id to be updated: ");
					int id = sc.nextInt();
					System.out.println("Enter the new name :");
					String name = sc.next();
					System.out.println("Enter the new party :");
					String party = sc.next();

					int cnt = dao.update(name, party, id);

				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}

				break;
			case 4:
				try (CandidateDao dao = new CandidateDao()) {
					List<candidate> list = dao.findAll();
					list.forEach(c -> System.out.println(c));
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 5:
				try (CandidateDao dao = new CandidateDao()) {
					System.out.print("Enter Candidate id (to vote): ");
					int candidateId = sc.nextInt();
					int cnt = dao.incrementVote(candidateId);
					System.out.println("Rows updated: " + cnt);
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 6:

				try (CandidateDao dao = new CandidateDao()) {
					System.out.print("Enter Party: ");
					String party = sc.next();
					List<candidate> list = dao.findByParty(party);
					list.forEach(c -> System.out.println(c));
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}

				break;

			}

		} while (choice != 0);
	}
}
