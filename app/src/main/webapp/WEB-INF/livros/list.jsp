<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8" />
        <title>Livros</title>
    </head>
    <body>
        <h1>Livros</h1>
        <table>
            <tr>
                <th>Id</th>
                <th>Título</th>
                <th>Gênero</th>
                <th>&nbsp</th>
            </tr>
            <c:forEach var="i" items="${livros}">
                <tr>
                    <td>${i.getId()}</td>
                    <td>${i.getTitulo()}</td>
                    <td>${i.getGenero()}</td>
                    <td>
                        <a href="/livros/update/${i.getId()}">Editar</a>
                        <a href="/livros/delete/${i.getId()}">Excluir</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>