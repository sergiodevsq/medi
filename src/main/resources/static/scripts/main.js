$(document).ready(function(){
	
	var tabela = $('#lista-pacientes').DataTable({
		"language":{
			"url": "//cdn.datatables.net/plug-ins/1.12.1/i18n/pt-BR.json",
			decimal: ',',
            thousands: '.',
		},
		columnDefs: [
            {
                targets: [0],
                orderData: [0, 1],
            },
            {
                targets: [1],
                orderData: [1, 0],
            },
            {
                targets: [4],
                orderData: [4, 0],
            },
        ],
	});
	
	$('#lista-pacientes tbody').on('click', 'tr', function () {
        if ($(this).hasClass('selected')) {
            $(this).removeClass('selected');
            $(this).removeClass('selecaolinha');
        } else {
            tabela.$('tr.selected').removeClass('selected');
            $(this).addClass('selected');
            $(this).addClass('selecaolinha');
        }
    });
 	
 	let data = document.getElementById('data');
	  data.addEventListener('change',(e)=>{
	  let startDateVal = e.target.value;
	  //document.getElementById('startDateSelected').innerText = startDateVal
	});
	
	 document.getElementById("btn-novoexame").addEventListener("click", function(event){
		event.preventDefault();
		$('#modal-novoexame').modal('show');
	});
	
	document.getElementById("btn-fechar").addEventListener("click", function(event){
		event.preventDefault();
		$('#modal-novoexame').modal('hide');
	});
});





