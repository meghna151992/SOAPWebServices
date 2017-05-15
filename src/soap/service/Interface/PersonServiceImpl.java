package soap.service.Interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import javax.jws.WebService;

import soap.service.Bean.Person;

@WebService(endpointInterface="soap.service.Interface.PersonService")
public class PersonServiceImpl implements PersonService {

	HashMap<Integer,Person> persons= new HashMap<Integer,Person>();
	@Override
	public boolean addPerson(Person p){
		if(persons.get(p.getId())!=null )return false;
		else 
			
		{
			persons.put(p.getId(), p);
			return true; 
		}
	}
	@Override
	public boolean deletePerson(int id) {
		
		if(persons.get(id)==null) return false;
		else {
			persons.remove(id);
			return true;
		}
		
		
	
	}
	@Override
	public Person getPerson(int id) {
		
		return persons.get(id);
	}
	@Override
	public Person[] getAllPerson() {
		
		Set<Integer> keys=persons.keySet();
		Person[] p = new Person[keys.size()];
		int i=0;
		
		for(int f : keys){
			p[i]=persons.get(f);
			i++;
		}
		return p;
	}
	
	
}
