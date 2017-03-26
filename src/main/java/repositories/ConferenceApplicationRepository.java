package repositories;

import domain.ConferenceApplication;

public interface ConferenceApplicationRepository {
	ConferenceApplication getApplicationByEmailAdress(String email);
	void add(ConferenceApplication application);
	int count();
}
