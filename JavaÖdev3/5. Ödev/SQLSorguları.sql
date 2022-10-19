
  -- SQL case insensitive dir yani küçük büyük harf duyarsızdır.

  select ContactName Adi, CompanyName Sirketadi, City Sehir from Customers  -- Burada tablodaki sütun isminin adını degiştirerek yeni ismi ile sütunları listeleyebiliriz. Buna ALIAS denir.

  select * from Customers where City = 'London' -- Burada Customers tablosundaki London şehrine ait tüm verileri where komutu ile çağırıyoruz.

  select * from Products where CategoryID = 1 or CategoryID = 3 -- Burada or komutu ile birden fazla şart kullanabiliriz. Ama iki şarttan birinin geçerli olması yeterlidir.

  select * from Products where CategoryID = 1 and UnitPrice > 10 -- Or komutu ile And komutunun farkı and komutunda istenen 2 şartında sağlanması gerekir. Or komutunda bir şartın sağlanması yeterlidir.

  select * from Products order by ProductName -- Burada order by komutu ile ürünler eğer string bir değerse alfabetik olarak a dan z ye sıralanır. Sayısal bir değer varsa en küçük sayıdan en büyük sayıya doğru sıralanır.
												-- Order by Productname ' den sonra asc komutunu kullanırsam yine order by gibi azdan çoğa doğru sıralanır. Ama desc komutunu yazarsam bu sefer tam tersi çoktan aza doğru sıralanır.

 select * from Products where CategoryID = 1 order by UnitPrice desc -- Kategorisi 1 olanları unitprice değerin en çoktan en az olana doğru sıralar.

 select count(*) from Products -- Burada products tablosunda kaç satır veri olduğunu count komutu ile öğrenebiliriz.

 select CategoryID from Products group by CategoryID -- Group by komutu ile categoryId de tekrar eden veriler varsa onları sadece 1 kez yazdırarak sıralama yapar. Group by kullanıldığında hangi veriyi sıralıyorsak onu select den sonra yazmamız gerekir yoksa program hata verir.

 select CategoryID, count(*) from Products group by CategoryID -- Burada categoryId de tekrar eden verileri bir kez alıyoruz ve sıralıyoruz daha sonra bu categoryId ye ait kaç tane verimiz var onu count komutu ile yazdırıyoruz.

 select CategoryID, count(*) from Products group by CategoryID having count(*) < 10 -- Group by komutundan sonra bir şart sunmak istiyorsak having kullanmamız gerekir. Ama group by dan önce ki işlemlerde şart sunmak için where kullanabiliriz. Burada id ye ait sayısı 10 dan küçük olan verileri getiriyoruz.

 select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName  -- Burada ki sorgularda iki farklı tabloyu inner join komutu ile select den sonra belirttiğimiz isimlerin olduğu sütunları getirecek şekilde birleştiririz.
 from Products inner join Categories															  -- Ama birleştirme işlemini yaparkan on komutu ile iki tabloda ki categoryId nin birbirine eşit olması gerekir.
 on Products.CategoryID = Categories.CategoryID                                                -- İki tablodaki category id leri birbirine eşit olan verileri bize listeler.

 select * from Customers c left join Orders o  -- Burada ki sorgularda yazdığımız sıraya göre yani customers tablosunda olupta orders tablosunda olmayan verileride left join komutu ile getiririz.
 on c.CustomerID = o.CustomerID                -- where şartı ile is null yani boş olan verileri buluruz.
 where o.CustomerID is null                    -- bu sayede customersda olupda ordersta olmayan verileri bulmuş oluruz.

