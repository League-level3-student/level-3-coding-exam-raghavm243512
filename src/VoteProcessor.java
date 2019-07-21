import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> votes) {
		// TODO Auto-generated method stub
		ArrayList<String> people = new ArrayList<String>();
		for (int i =0;i<votes.size();i++) {
			votes.add(i, votes.remove(i).toLowerCase());
		}
		for (int i =0;i<votes.size();i++) {
			if(!people.contains(votes.get(i)))
				people.add(votes.get(i));
		}
		int[] votesPerPerson = new int[people.size()];
		for (int i =0;i<people.size();i++) {
			for (String j : votes) {
				if (people.get(i).equals(j))
					votesPerPerson[i]++;
			}
		}
		
		for (int i =0;i<people.size();i++) {
			for (int j =0;j<people.size();j++) {
				if(i!=j&&votesPerPerson[i]==votesPerPerson[j])
					return "TIE";
			}
		}
		int max =0;
		int winner=0;
		for (int i =0;i<people.size();i++) {
			if (votesPerPerson[i]>max) {
				max=votesPerPerson[i];
				winner=i;
			}
		}
		return people.get(winner);
	}

}
