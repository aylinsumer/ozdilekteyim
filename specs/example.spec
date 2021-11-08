Ozdilekteyim Otomasyon
=====================

Uygulama Açılışı
---------------------------
* "1" saniye bekle
*  "Mağazadan Alışveriş" AssertEquals with id element "textView"
* "tv_startShoppingStore" Id'li elemente tıkla
* "Anasayfa" AssertEquals with id element "largeLabel"

Kategori-Kadın-Pantolon araması
-------------------------------

* "3" saniye bekle
* "nav_categories" Id'li elemente tıkla
* "Kategoriler" AssertEquals with cssSelector element "android.widget.TextView"
* "RelativeLayout[@index='1']" Xpath'li elemente tıkla.
* "Elbise & Tulum" AssertEquals with xpath element "//*[@ElementId='038674cb-36eb-43dc-a295-50fdc0f2a2d1']"
* "[@elementId='f1aab8ba-407f-4e4c-88f0-4385d4de073c']" Xpath'li elemente tıkla.

Sayfada Scroll Yapılması ve pantolon seçimi
-------------------------------------------
* "2" saniye bekle
* "2" kere scroll yap
* "//android.widget.FrameLayout[@index ='0']" Xpath'li elemente tıkla.
* "//android.widget.FrameLayout[@index ='0'][@resource-id='TextView']" AssertEquals with xpath elements "//[@resource-id='tvItemDescription']"

Favorilere Ekle Butonu Kontrolü
------------------------------
* "2" saniye bekle
* "imgFav" Id'li elemente tıkla
* "Giriş Yap" AssertEquals with id element "btnLogin"

Login Sayfası
--------------

* "2" saniye bekle
* "etEposta" id'li elemente "usermail@email.com" değerini yaz
* "etPassword" id'li elemente "userpassword" değerini yaz
* "btnLogin" Id'li elemente tıkla
* "ivBack" Id'li elemente tıkla
* "ivBack" Id'li elemente tıkla

Sepete Ekleme
-------------

* "//android.view.ViewGroup[@index ='3']" Xpath'li elemente tıkla.
* "//*[@resource-id='relLaySizeIn][@index ='1']" Xpath'li elemente tıkla.
* "relLayAddCartBtn" Id'li elemente tıkla


