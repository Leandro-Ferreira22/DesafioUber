package com.application;

public class EmailSenderService implements EmailSenderUseCase{

    private final EmailSenderGateway emailSenderGateway:

    @Autowired
    public EmailSenderService(EmailSenderGateway emailgateway) {
        this.emailSenderGateway = emailgateway
    }


    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body)
    }

}