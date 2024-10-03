//Multiple inheritance achived by multiple interfaces
class Phone
{
	void voiceCall()
	{
		System.out.println("Make voice Call");
	}
	void sms()
	{
		System.out.println("We Can Send Sms");
	}
			
}

interface Camera
{
	void click();
	void record();
}
interface Player
{
	void Play();
	void Pause();
	void Stop();
}

class Smartphone extends Phone implements Camera,Player
{

	@Override
	public void Play() {
		System.out.println("Play Video");
		
	}

	@Override
	public void Pause() {
		System.out.println("Pause a video");
		
	}

	@Override
	public void Stop() {
		System.out.println("Stop Video");
		
	}

	@Override
	public void click() {
		System.out.println("Click Photo");
		
	}

	@Override
	public void record() {
		System.out.println("REcord Video");
		
	}
	
}


public class interfaceDemo2 {

	public static void main(String[] args) {
		
		Smartphone o=new Smartphone();
		o.voiceCall();
		o.sms();
		o.record();
		o.click();
		o.Play();
		o.Pause();
		
		

	}

}
