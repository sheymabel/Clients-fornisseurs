<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><c: value="${clientss.nom}" default="Inconnu" />
<input  type="text"  name="nom"  value="<c:out  value="${param.nom}"/>"  />  

<c:if  test="${empty  personne.nom}"  >Inconnu</c:if>  
<c:if  test="${empty  personne.nom}"  var="resultat"  />  



<c:choose>  
   <c:when  test="${personne.civilite  ==  'Mr'}">  
    Bonjour  Monsieur  
   </c:when>  
   <c:when  test="${personne. civilite  ==  'Mme'}">  
    Bonjour  Madame  
   </c:when>  
   <c:when  test="${personne. civilite  ==  'Mlle'}">  
    Bonjour  Mademoiselle  
   </c:when>  
   <c:otherwise>  
    Bonjour  
   </c:otherwise>  
</c:choose>  

<c:forEach  begin="1"  end="4"  var="i">  
<c:out  value="${i}"/><br>  
</c:forEach> 



<c:forEach  begin="1"  end="12"  var="i"  step="3">  
<c:out  value="${i}"/><br>  
</c:forEach>  


<c:forEach  begin="1"  end="12"  var="i"  step="3"  varStatus="vs">  
 index  =  <c:out  value="${vs.index}"/>  :   count  =  <c:out  
value="${vs.count}"/>  :  
   value  =  <c:out  value="${i}"/>  
   <c:if  test="${vs.first}">  
   :  Premier  element  
   </c:if>  
   <c:if  test="${vs.last}">  
   :  Dernier  element  
   </c:if>  
   <br>  
.   </c:forEach> 


<c:forTokens var="token" items="chaine 1;chaine 2;chaine 3" delims=";">  
<c:out value="${token}" /><br>  
</c:forTokens>  

<c:forTokens var="token" items="chaine 1;chaine 2,chaine 3" delims=";,">  
<c:out value="${token}" /><br>  
</c:forTokens>  

<c:forTokens var="token" items="chaine 1;;chaine 2;;;chaine 3" delims=";">  
<c:out value="${token}" /><br>  
</c:forTokens> 


<c:forTokens var="token" items="chaine 1;chaine 2;chaine 3" delims=";" begin="1" 
end="1" >  
<c:out value="${token}" /><br>  
</c:forTokens>  

</body>
</html>