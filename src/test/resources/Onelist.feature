#Author: yunindanin@gmail.com
Feature: Add List di aplikasi 1List
	
	Scenario Outline: Add List data valid aplikasi 1List
		Given User berada di halaman utama 1List
		When User menekan add List
		And User memasukkan listTitle <listTitle>
		And User memasukkan isi list 1 <isiList1>
		And User memasukkan isi list 2 <isiList2>
		And User memasukkan isi list 3 <isiList3>
		And User memasukkan isi list 4 <isiList4>
		And User memasukkan isi list 5 <isiList5>
   Then User mendapatkan List yang diinginkan

	Examples:
	|listTitle	|isiList1	|isiList2	|isiList3	|isiList4	|isiList5	|
	|Shopping		|Kemeja		|Celana		|Kaos			|Rok 			|Kemeja		|

Scenario Outline: Add List data dengan spasi di aplikasi 1List
		Given User berada di halaman utama 1List
		When User menekan add List
		And User memasukkan listTitle <listTitle>
		And User memasukkan isi list 1 <isiList1>
		And User memasukkan isi list 2 <isiList2>
		And User memasukkan isi list 3 <isiList3>
		And User memasukkan isi list 4 <isiList4>
		And User memasukkan isi list 5 <isiList5>
   Then User mendapatkan List yang diinginkan

	Examples:
	|listTitle|isiList1	|isiList2	|isiList3	|isiList4	|isiList5	|
	|Kosong		|     		|       	|       	|     		|         |
	
	
	Scenario Outline: Add List data dengan simbol di aplikasi 1List
		Given User berada di halaman utama 1List
		When User menekan add List
		And User memasukkan listTitle <listTitle>
		And User memasukkan isi list 1 <isiList1>
		And User memasukkan isi list 2 <isiList2>
		And User memasukkan isi list 3 <isiList3>
		And User memasukkan isi list 4 <isiList4>
		And User memasukkan isi list 5 <isiList5>
   Then User mendapatkan List yang diinginkan

	Examples:
	|listTitle|isiList1	|isiList2	|isiList3	|isiList4	|isiList5	|
	|Simbol		|@@@@@@@@	|---------|*********|%%%%%%%%%|#########|


Scenario Outline: Cancel data saat Add List
		Given User berada di halaman utama 1List
		When User menekan add List
		And User memasukkan invalidTitle <listTitle>
		And User menekan Cancel button
		Then User kembali ke halaman utama
		
	Examples:
	|listTitle|
	|Cancel		|
	
