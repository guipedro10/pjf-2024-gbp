<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert</title>
</head>
<body>
    <h1>Novo Livro</h1>
    <form action="/livros/insert" method="post">
        <div>
            <label>Titulo</label>
            <input type="text" name="titulo" />
        </div>
        <div>
            <label>Gênero</label>
            <input type="text" name="genero" />
        </div>
        <button type="submit">Salvar</button>
    </form>
</body>
</html>