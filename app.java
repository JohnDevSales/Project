public static void sendLeadOverlapCompleteNotification(Overlap__c sobreposição){
   Messaging.SingleEmailMessage mensagem = new Messaging.SingleEmailMessage();
   message.setTargetObjectId(contato.id); 
   message.setSenderDisplayName('Suporte da Empresa'); 
   message.setReplyTo(' no-reply@company.com '); 
   message.setUseSignature(false); 
   message.setBccSender(false); 
   message.setSaveAsActivity(false);
  EmailTemplate emailTemplate = [Selecione Id,Subject,Description,HtmlValue,DeveloperName,Body from EmailTemplate where name = ' Test Account Alert Email '];
  message.setTemplateID(emailTemplate.Id); 
  message.setWhatId(conta.Id); // Isso é importante para que os campos de mesclagem no modelo funcionem
   message.toAddresses = new String[] { contact.email};
  Messaging.SingleEmailMessage[] messages = new List<Messaging.SingleEmailMessage> {message};
  Messaging.SendEmailResult[] resultados = Messaging.sendEmail(messages); 
 
if (results[0].success) 
{ 
   System.debug('O email foi enviado com sucesso.'); 
} else { 
   System.debug('O email falhou ao enviar: ' + results[0].errors[0].message); 
}
}