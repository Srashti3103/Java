// Interface (Abstraction) 
interface MessageService {
	void sendMessage(String message);
}

// Concrete Implementation 1 
class EmailService implements MessageService {
	public void sendMessage(String message) {
		System.out.println("Email sent: " + message);
	}
}

//Concrete Implementation 2 
class SMSService implements MessageService {
	public void sendMessage(String message) {
		System.out.println("SMS sent: " + message);
	}
}

//High-level Class (Loosely Coupled) 
class NotificationService {
	private MessageService messageService;

//Dependency Injection (Constructor Injection) 
	public NotificationService(MessageService messageService) {
		this.messageService = messageService;
	}

	public void notifyUser(String message) {
		messageService.sendMessage(message);
	}
}

public class LooseCouplingWuthDependencyInjection {
	public static void main(String[] args) {
		// Use EmailService
		MessageService emailService = new EmailService();
		NotificationService emailNotification = new NotificationService(emailService);
		emailNotification.notifyUser("Hello via Email!"); // Output: Email sent: Hello via Email!

		// Use SMSService
		MessageService smsService = new SMSService();
		NotificationService smsNotification = new NotificationService(smsService);
		smsNotification.notifyUser("Hello via SMS!"); // Output: SMS sent: Hello via SMS!
	}
}
