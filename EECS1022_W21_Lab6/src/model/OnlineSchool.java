package model;

public class OnlineSchool {
	private Participant[] participants = new Participant[0];

	public Participant[] getParticipants(String title) {
		int numOfParticipants = 0;
		for(Participant participant : participants) {
			if(participant.isEnrolled(title))
				numOfParticipants++;
		}
		Participant [] enrolled = new Participant[numOfParticipants];
		int index = 0;

		for(Participant participant : participants) {
			if(participant.isEnrolled(title)) {
				enrolled[index] = participant;
				index++;
			}
		}
		return enrolled;
	}

	public void addParticipant(Participant participant) {
		if(participants.length<100) {
			int length = participants.length;
			Participant [] newParticipants = new Participant[length+1];
			for(int i = 0;i<length;i++) {
				newParticipants[i]= participants[i];
			}
			newParticipants[length] = participant;
			participants = newParticipants;
		}
		
	}

}
