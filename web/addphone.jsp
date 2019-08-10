<%--
  Created by IntelliJ IDEA.
  User: QuyenDo
  Date: 8/10/2019
  Time: 7:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add phone</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<div style="max-width: 400px; margin: auto">
    <h1 class="text-primary text-center">Add Phone</h1>
    <form method="post">
        <div class="form-group">
            <label>Phone Id</label>
            <input type="text" class="form-control" placeholder="Phone Id" name="id">
            <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
        </div>
        <div class="form-group">
            <label>Name</label>
            <input type="text" class="form-control" placeholder="Name of phone" name="name">
        </div>
        <div class="form-group">
            <label>Brand</label>
            <select name="brand" id="" class="form-control">
                <option value="apple">Apple</option>
                <option value="samsung">Samsung</option>
                <option value="xaomi">Xaomi</option>
                <option value="oppo">Oppo</option>
            </select>
        </div>
        <div class="form-group">
            <label>Price</label>
            <input type="text" class="form-control" placeholder="Price" name="price">
        </div>
        <div class="form-group">
            <label>Description</label>
            <textarea class="form-control" placeholder="Price" name="description"></textarea>
        </div>
        <button type="submit" class="btn btn-primary">Save</button>
    </form>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.js"></script>
<script>
    $().ready(function() {
        $("#demoForm").validate({
            onfocusout: false,
            onkeyup: false,
            onclick: false,
            rules: {
                "id": {
                    required: true,
                    maxlength: 15
                },
                "name": {
                    required: true,
                },
                "brand": {
                    required: true,
                },
                "price": {
                    number: true,
                    min: 0,
                    max: 999999999
                },
                "description": {
                    required: true,
                }
            }
        });
    });
</script>
</body>
</html>
